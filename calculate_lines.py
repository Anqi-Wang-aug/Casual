# a python program to calcualte number of non-empty lines in programs
# paths of programs must be given path in a seperate input file. This input file must be put as command line arguments

import sys
import os

if len(sys.argv) < 2:
	raise ValueError('Please put some flies!')
line_num= 0
try:
	input=open(sys.argv[1])
	inputs = input.readlines()
except Exception as e:
        print(e)


print("Your input files:");
for x in inputs:
	x=x.strip() 
	if os.path.exists(x):
		try:
			print(x)
			f=open(x)
			text = (line.rstrip() for line in f)
			text=list(line for line in text if line)
			size = len(text)
			line_num = line_num+size
		except Exception as e:
			print(e)

print("You wrote " + str(line_num) + " lines of codes.")
