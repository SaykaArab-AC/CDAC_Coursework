/*
 * Q3.2_GameEngineEntitySystem.cpp
 *
 *  Created on: 30-Aug-2026
 *      Author: sayka
 */

#include "Q3.2_GameEngineEntitySystem.h"

double Physics::clamp(double val, double min, double max){
		if(val<min){
			return min;
		}
		if(val>max){
			return max;
		}
		return val;
	}

double Physics::lerp(double a, double b, double t){
	return (a+(b-a)*t);
}

int GameMath::clamp(int val, int min, int max){
	if(val<min){
		return min;
	}
	if(val>max){
		return max;
	}
	return val;
}

double GameMath::lerp(double a, double b, double t){
	return (a+(b-a)*t);
}
