class Solution {
public:
    bool isRobotBounded(string instructions) {
        vector<int> direction(4);
        int cur = 0;
        for (char c : instructions) {
            if (c == 'L')
                cur = (cur + 1) % 4;
            else if (c == 'R')
                cur = (cur + 3) % 4;
            else
                ++direction[cur];
        }
        return cur != 0 || (direction[0] == direction[2] && direction[1] == direction[3]);
    }
};