//
// Created by 姜骏赫 on 2022/7/19.
//
#include "iostream"
#include "string"

using namespace std;
//a = “123”,b = “56”，a * b = “123” * “6” + “123” * “50”，而"123" * “50” = “123” * “5” + “0”.
// 要实现字符串相乘运算，首先要实现字符串和单个字符的相乘运算(其实是为了简化多位数乘法)，然后要实现字符串的相加运算

/**
 * step 2 列式加法
 * @param a
 * @param b
 * @return
 */
string add(const string a, const string b) {
    string result;
    int i = a.size() - 1;
    int j = b.size() - 1;
    int extra = 0;

    while (i >= 0 && j >= 0) {
        result = to_string((a[i] - '0' + b[i] - '0' + extra) % 10) + result;
        extra = (a[i] - '0' + b[i] - '0' + extra) / 10;
        i--;
        j--;
    }

    while (i >= 0) {
        result = to_string((a[i] - '0' + extra) % 10) + result;
        extra = (a[i] - '0' + extra) / 10;
        i--;
    }

    while (j >= 0) {
        result = to_string((b[j] - '0' + extra) % 10) + result;
        extra = (b[j] - '0' + extra) / 10;
        j--;
    }

    if (extra != 0) { result = to_string(extra) + result; }
    return result;
}

/**
 * 列式计算中
 * step 1 乘数与被乘数一位相乘
 * @param a
 * @param b
 * @return
 */
string _multiply(const string a, const char b) {
    string result;
    int extra = 0;
    int i = a.size() - 1;
    while (i >= 0) {
        //相乘满十进一
        result = to_string(((a[i] - '0') * (b - '0') + extra) % 10) + result;
        //进一后余数
        extra = ((a[i] - '0') * (b - '0') + extra) / 10;
        i--;
    }
    if (extra != 0) { result = to_string(extra) + result; }
    return result;
}

/**
 *  两字符串相乘
 * @param a
 * @param b
 * @return
 */
string multiply(const string a, const string b) {
    string result;
    for (int i = b.size() - 1; i >= 0; i--) {
        //1 列式相乘
        string temp = _multiply(a, b[i]);
        //b 末位为 0
        for (int j = 0; j < b.size() - 1 - i; j++) {
            temp = temp + "0";
        }
        //2 列式相加
        result = add(result, temp);
    }
    return result;
}

/**
 * 大数阶乘
 * @param n
 * @return
 */
string factorial(int n) {
    string result = "1";
    for (int i = 2; i <= n; i++) {
        result = multiply(result, to_string(i));
    }
    return result;
}

int main() {
    int n;
    while (cin >> n) {
        string result = factorial(n);
        cout << result << endl;
    }
    return 0;
}

/**
 * 20内阶乘
 * @return
 */
//int main() {
//    int n;
//    cin >> n;
//    long result = 1;
//    for (int i = 1; i <= n; i++) {
//        result *= i;
//    }
//    cout << result;
//    return 0;
//}


