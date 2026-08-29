#include <iostream>
#include <iomanip>
#include "Q3.2_GameEngineEntitySystem.h"
using namespace std;

int level=1;

class Entity{
public:
	Entity(){

	}

	int getHealth() const {
		return health;
	}

	Entity& setHealth(int health) {
		this->health = health;
		return *this;
	}

	int getLevel() const {
		return level;
	}

	Entity& setLevel(int level) {
		this->level = level;
		return *this;
	}

	const string& getName() const {
		return name;
	}

	Entity& setName(const string &name) {
		this->name = name;
		return *this;
	}

	const string& getType() const {
		return type;
	}

	Entity& setType(const string &type) {
		this->type = type;
		return *this;
	}

	void displayDetails(){
		cout<<"----------------------------------------"<<endl;
		cout<<"Name : "<<name<<endl;
		cout<<"Health : "<<health<<endl;
		cout<<"Level : "<<level<<endl;
		cout<<"Type : "<<type<<endl;
		cout<<"----------------------------------------"<<endl;
	}
private:
	string name;
	int health;
	int level;
	string type;


};

int main() {
	int level=90;
	// PART A ->
	Entity player,enemy,item;

	player.setName("Aragorn").setHealth(100).setLevel(8).setType("Player");
	enemy.setName("HealthPotion").setHealth(75).setLevel(18).setType("Enemy");
	item.setName("Orc").setHealth(40).setLevel(15).setType("Item");

	player.displayDetails();
	enemy.displayDetails();
	item.displayDetails();

	// PART B ->
	cout<<"Clamped value : "<<Physics::clamp(32,50,80)<<endl;
	cout<<"Linear Interpolation  : "<<Physics::lerp(42,74,89)<<endl;

	cout<<"Clamped value : "<<GameMath::clamp(62,50,90)<<endl;
	cout<<"Linear Interpolation  : "<<GameMath::lerp(12,7,14)<<endl;
	cout<<endl;

	// PART C ->

	int r,c;
	cout<<"Enter Rows & Cols : "<<endl;
	cin>>r>>c;

	int **game=new int*[r];
	int grass=0;
	int Water=0;
	int Mountains=0;
	int Forest=0;
	int Dungeon=0;

	cout<<"Enter values of legens (0-4) : "<<endl;
	for(int i=0;i<r;i++){
		game[i]=new int[c];
		for(int j=0;j<c;j++){
			cin>>game[i][j];
		}
	}

	cout<<"===== GAME MAP ("<<r<<" x "<<c<<" ) ====="<<endl;
	for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
			if(game[i][j]==0){
				grass++;
			}
			else if(game[i][j]==1){
				Water++;
			}
			else if(game[i][j]==2){
				Mountains++;
			}
			else if(game[i][j]==3){
				Forest++;
			}
			else{
				Dungeon++;
			}
			cout<<game[i][j]<<"   ";
		}
		cout<<endl;
	}

	cout<<"\nLegend: 0 = Grass  1 = Water  2 = Mountain  3 = Forest  4 = Dungeon"<<endl;
	cout<<"\nTiles Count -> "<<endl;
	cout<<left;
	cout<<setw(10)<<"Grass "<<": "<<grass<<endl;
	cout<<setw(10)<<"Water "<<": "<<Water<<endl;
	cout<<setw(10)<<"Mountains "<<": "<<Mountains<<endl;
	cout<<setw(10)<<"Forest "<<": "<<Forest<<endl;
	cout<<setw(10)<<"Dungeon "<<": "<<Dungeon<<endl;

	for(int i=0;i<r;i++){
		delete[] game[i];
	}

	delete[] game;

	// BOONUS QUE
	cout<<"level = (from global scope) "<<::level<<endl;
	cout<<"level = (from local scope) "<<level<<endl;
	return 0;
}

















