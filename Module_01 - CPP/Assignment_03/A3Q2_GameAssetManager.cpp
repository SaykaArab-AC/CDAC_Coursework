#include <iostream>
#include <memory>
using namespace std;

class Texture{
	string name;
	int width;
	int height;

public :
	Texture(){
	}

	Texture(string name,int width,int height):name(name),width(width),height(height){
		cout<<"Texture Loaded..."<<endl;
	}
	~Texture(){
		cout<<"Texture Released.."<<endl;
	}

	void display()const{
		cout<<"Width = "<<width<<endl;
		cout<<"Height = "<<height<<endl;
	}
};

class Shader{
	string name;
	string type;

public :
	Shader(){
		cout<<"\nShared Compiled..."<<endl;
	}

	Shader(string name,string type):name(name),type(type){
		cout<<"\nShader Compiled..."<<endl;
	}
	~Shader(){
		cout<<"Shader Destroyed.."<<endl;s
	}

	int getReferenceCount(shared_ptr<Shader> sp){ 	//auto can't be used as argument
		return sp.use_count();
	}

	const string& getName() const {
		return name;
	}
};

class AudioClip{
	string name;
	double duration;

public :
	AudioClip(){

	}
	AudioClip(string name,double duration):name(name),duration(duration){
		cout<<"\nAudio Clip Loaded..."<<endl;
	}
	~AudioClip(){
		cout<<"Audio Clip Destroyed..."<<endl;
	}
	const string& getName() const {
		return name;
	}
};


int main() {
	//PART A ->

	auto tex=make_unique<Texture>("player_sprite", 512, 512);
	tex->display();

	//	unique_ptr<Texture> tex2=text1   -> this fails bcz of exclusivity nature of unique ptr
	//									    we cant make 2 unique ptrs own same object

	unique_ptr<Texture> tex2=move(tex);
	cout<<"tex is null : "<<(tex==nullptr?"YES":"NO")<<endl;

	//PART B ->

	auto shader =make_shared<Shader>("main_vert", "vertex");
	cout<<"Ref Count : "<<shader.use_count()<<endl;

	{
		auto rendererRef=shader;
		cout<<"Ref Count : "<<shader.use_count()<<endl;

		auto editorRef=shader;
		cout<<"Ref Count : "<<shader.use_count()<<endl;
	}

	cout<<"Ref Count : "<<shader.use_count()<<endl;

	// PART C ->

	auto audio=make_shared<AudioClip>("explosion", 3.5);
//	auto observer=audio;   ->it becomes shared_ptr

	weak_ptr<AudioClip> observer=audio;

	if(auto clip=observer.lock()){
		cout<<"Clip alive : "<< clip->getName() <<endl;
	}

	audio.reset();
	if(observer.expired()){
		cout<<"Clip already unloaded"<<endl;
	}
	return 0;
}
