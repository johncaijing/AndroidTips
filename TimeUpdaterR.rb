#!/usr/bin/ruby
# -*- coding: UTF-8 -*-

#类定义
class TimeUpdater
	#构造函数
	def initialize(filePath)
		@filepath = filePath
	end
	def read
		puts "read"
		file = File.open(@filepath,"r")
		contents=file.read
		file.close
		return contents
	end
	def write(str)
		puts "write"
		file = File.open(@filepath,"w")
		file.write(str)
		file.close
	end
	def getdatestr
		puts "getdatestr"
		time = Time.new
		time.strftime("%Y-%m-%d %H:%M")
	end
	def update
		puts "update"
		dateStr = getdatestr
		str = read
		new_str = str.gsub(/\d{4}[-]\d{2}[-]\d{2}\s\d{2}[:]\d{2}/,dateStr)
		puts new_str
		write(new_str)
	end
end

timeUpdater = TimeUpdater.new("./README.md")
puts "start"
timeUpdater.update
puts "end"