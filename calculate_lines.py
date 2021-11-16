import sys
import os

if len(sys.argv) < 2:
	raise ValueError('Please put some flies!')
line = 0
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
			f=open(x)
			text = f.readlines()
			size = len(text)
			line = line+size
			print(x)
		except Exception as e:
			print(e)

print("You wrote " + str(line) + " lines of codes.")
