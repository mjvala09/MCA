import numpy as np
import pandas as pd
from numpy.random import randn
np.random.seed(50)
df = pd.DataFrame(randn(6, 4), ['a', 'b', 'c', 'd', 'e', 'f'], [
                  'w', 'x', 'y', 'z'])
print(df)
