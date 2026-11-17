
import numpy as np

# Radio signal detection
signal = np.array([0.2, 0.5, 0.8, 0.1, 0.9, 0.3, 0.7])

threshold = 0.6

print("Radio Signal Detection")

for value in signal:
    if value >= threshold:
        print(value, "- Radio Signal Detected")
    else:
        print(value, "- No Radio Signal")
