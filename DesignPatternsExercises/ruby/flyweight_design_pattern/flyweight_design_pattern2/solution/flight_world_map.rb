require_relative 'flight_factory'

class FlightWorldMap
  def initialize
    @flights = ['Air France', 'American Airlines', :BA, :Delta, :KLM, 'United Airlines']
    # @factory = __________(7)__________
    @factory = FlightFactory.new
  end

  # def __________(8)__________
  def display_all_flight
    10.times do
      # flight = __________(9)__________.flight(random_flight)
      flight = @factory.flight(random_flight)
      flight.draw_on_map(random_flight_number, random_latitude, random_longitude)
    end
  end

  def random_latitude
    rand(0..90)
  end

  def random_longitude
    rand(0..180)
  end

  def random_flight
    @flights[rand(0..5)]
  end

  # def __________(10)__________
  def random_flight_number
    rand(100..900)
  end
end
