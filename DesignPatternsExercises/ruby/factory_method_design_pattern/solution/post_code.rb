class PostCode
  # attr_reader __________(1)__________
  attr_reader :post_code

  # def __________(2)__________(post_code)
  def initialize(post_code)
    if valid_post_code?(post_code)
      @post_code = post_code
      puts "Instantiated PostCode with #{@post_code}"
    else
      raise 'Invalid Post Code'
    end
  end

  def valid_post_code?(post_code)
    raise NotImplementedError, 'Subclasses must override this method'
  end
end
