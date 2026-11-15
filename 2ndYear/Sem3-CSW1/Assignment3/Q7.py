# Write a Python generator function called sensor data stream that simulates incoming temperature readings from a sensor.
# • The generator should yield a new random temperature value between 20°C
# and 30°C each time it is called.
# • Demonstrate how to use this generator to process and print the first 10 sensor
# readings.
# This exercise will help you understand how generators can be used to simulate realtime data streams and manage continuous data flow efficiently.

import random
def sensor_data_stream():
    while True:
        yield round(random.uniform(20,30),2)
sensor=sensor_data_stream()
print("First 10 Sensor Readings:")
for i in range(10):
    print(f"{i+1}. {next(sensor)}°C")