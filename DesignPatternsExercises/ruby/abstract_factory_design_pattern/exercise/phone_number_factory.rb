require_relative 'us_phone_number'
require_relative 'uk_phone_number'

class PhoneNumberFactory
  def __________(3)__________(country, phone_number)
    return __________(4)__________.new(phone_number) if country == 'US'
    return __________(5)__________.new(phone_number) if country == 'UK'

    raise 'Country is not supported'
  end
end