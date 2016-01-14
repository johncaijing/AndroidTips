#!/usr/bin/python
# -*- coding: UTF-8 -*-
import datetime
import re

class TimeUpdater(object):
	"""docstring for TimeUpdaterP"""
	def __init__(self, filePath):
		self.filePath = filePath

	def read(self):
		f = open(self.filePath,'r')
		readStr = f.read()
		f.close()
		return readStr

	def getCurrentDateStr(self):
		return datetime.datetime.now().strftime("%Y-%m-%d %H:%M")
	
	def write(self,str):
		f = open(self.filePath,'w')
		f.write(str)
		f.close()

	def update(self):
		dateStr = self.getCurrentDateStr()
		pattern=r'[0-9]{4}[-][0-9]{2}[-][0-9]{2}\s[0-9]{2}[:][0-9]{2}'
		str = self.read()
		updateStr = re.sub(pattern,dateStr,str)
		self.write(updateStr) 

def main():
	updater = TimeUpdater('./README.md')
	updater.update()

if __name__=='__main__':
	print('start')
	main()
	print('finish')



      



		