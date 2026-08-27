#include <iostream>
using namespace std;

struct Layout1 {
    char c1;
    int i;
    char c2;
};

struct Layout2 {
    int i;
    char c1;
    char c2;
};

int main() {

    cout << "Size of Layout1 = " << sizeof(Layout1) << endl;  //1+3(padding)+4+1+3(padding)
    cout << "Size of Layout2 = " << sizeof(Layout2) << endl; //4+1+1+2(padding)

    /*
    1. The reason why the size differs is how the compiler internally arranges  them
    2. Padding refers to the extra letfout or unsuded memory tht compiler adds after members of structure.
    3. Member order is imp or mattera bcz it can change the size of structure .
    */

    return 0;
}