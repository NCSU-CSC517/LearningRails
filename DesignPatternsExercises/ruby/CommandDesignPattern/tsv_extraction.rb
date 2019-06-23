require_relative 'extraction'
require_relative 'tsv_extractor'

class TSVExtraction < Extraction

  attr_accessor :file

  def initialize(file)
    @file = file
  end

  def call_correct_extraction
    # _________(8)_________
    TSVExtractor.new.extract
  end

end