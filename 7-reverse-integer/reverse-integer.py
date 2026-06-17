class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        sign = -1 if x < 0 else 1
        temp = int(str(abs(x))[::-1]) * sign

        if(temp > 2 ** 31 - 1 or temp < -(2** 31)):
         return 0
        else:
         return temp

