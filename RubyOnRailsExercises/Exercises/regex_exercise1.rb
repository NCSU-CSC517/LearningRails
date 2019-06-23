# Please fill in the blanks so that valid_date(date) returns true only if date is valid.
# A valid date format is like 2011-11-08. (assume the year can only be 20XX and February always has 28 days.)

def valid_date(date)
  # __(1)__, __(2)__, __(3)__
  if date =~ /^(____)-(____)-(____)$/
    # $1 captures the year, $2 captures the month and $3 captures the day of entered date

    # __(4)__
    return false if (____) && ($2 == '04' || $2 == '06' || $2 == '09' || $2 == '11')
    # It will return false if Feb, Jun, Sep, or Nov has 31st

    # __(5)__
    return false if ($2 == "02") && (____)
    # It will return false if Feb has more than 28 days

    return true
  end
  false
end