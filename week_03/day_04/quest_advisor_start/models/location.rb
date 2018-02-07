require_relative("../db/sql_runner")

class Location

  attr_reader :id
  attr_accessor :name, :category

  def initialize( options )
    @id = options['id'].to_i
    @name = options['name']
    @category = options['category']
  end

  def save()
    sql = "INSERT INTO locations
    (
      name,
      category
    )
    VALUES
    (
      $1, $2
    )
    RETURNING id"
    values = [@name, @category]
    location = SqlRunner.run( sql, values ).first
    @id = location['id'].to_i
  end

  def users()
    sql =   "SELECT DISTINCT users.*
    FROM users
    INNER JOIN visits
    ON visits.user_id = user_id
    WHERE visits.location_id = $1"
    values =[@id]
    user_hashes = SqlRunner.run(sql, values)
    result = user_hashes.map {|user_hash| User.new(user_hash) }
    return result
  end

  def self.all()
    sql = "SELECT * FROM locations"
    locations = SqlRunner.run(sql)
    # result = locations.map { |location| Location.new( location ) }
    # return result
    return Location.map_items(locations)
  end

  def self.delete_all()
    sql = "DELETE FROM locations"
    SqlRunner.run(sql)
  end
#The below is a class method that refactors the self.all() method
  def self.map_items(location_hashes)
    result = location_hashes.map {|location_hash| Location.new(location_hash)}
    return result
  end

end
