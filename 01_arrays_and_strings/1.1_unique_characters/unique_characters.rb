# Solution 1 - use hashmap to determine if a string contains all unique characters.
def unique_characters_01(input_string)
	character_map = {}
	input_string.split('').each do |c|
		unless character_map[c].nil?
			return false
		end
		character_map[c] = true
	end
	return true
end

# Solution 2 - sort input string, compare adjacent characters.
def unique_characters_02(input_string)
	input_string = input_string.chars.sort.join
	previous_char = nil
	(0..(input_string.size-1)).each do |i|
		current_char = input_string[i]
		if previous_char == current_char
			return false
		end
		previous_char = current_char
	end
	return true
end
