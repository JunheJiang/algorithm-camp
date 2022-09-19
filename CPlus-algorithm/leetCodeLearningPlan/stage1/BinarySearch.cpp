//
// Created by 姜骏赫 on 2022/1/21.
//

#include <iostream>
#include "BinarySearch.h"

int BinarySearch::search(vector<int> &nums, int target) {
    int low = 0, high = nums.size() - 1;
    while (low <= high) {
        int mid = (high - low) / 2 + low;
        int num = nums[mid];
        if (num == target) {
            return mid;
        } else if (num > target) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return -1;
}

int main() {
    using namespace std;
    BinarySearch binarySearch;
    vector<int> list = {1, 2, 3, 4, 5, 6, 7};
    int i = binarySearch.search(list, 3);
    cout << i << '\n';
    return i;
}