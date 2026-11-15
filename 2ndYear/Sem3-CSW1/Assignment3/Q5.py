# Create a Python decorator called timer that helps measure how long a function takes
# to run.
# • A decorator is a special tool that wraps around a function to add extra features
# without changing the original function’s code.
# • The timer decorator should work with any function, regardless of the number
# of input arguments.
# • When a function with this decorator is called, it should:
# – Record the time before the function starts.
# – Execute the original function.
# – Record the time after it finishes.
# – Calculate and print how many seconds the function took to run.
# • To demonstrate its functionality, write a simple function that waits for a random
# duration (between 0.5 and 1.5 seconds), decorate it with @timer, and then call
# it.
# • The program should print both the sleep duration and the total time taken for
# the function to execute.

import time
import random
def timer(func):
    def wrapper(*args,**kwargs):
        start=time.time()
        func(*args,**kwargs)
        end=time.time()
        print(f"Time Taken: {end-start:.2f} seconds")
    return wrapper
@timer
def sleep():
    t=random.uniform(0.5,1.5)
    print(f"Sleep Duration: {t:.2f} seconds")
    time.sleep(t)
sleep()