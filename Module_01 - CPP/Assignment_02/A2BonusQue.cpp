#include <iostream>
using namespace std;

namespace Engine{
	namespace Audio{
		void playSound(string name){
		cout<<"Playing: "<<name<<endl;
		}
	}
}

int main() {
	Engine::Audio::playSound("sword_clash");
	return 0;
}
