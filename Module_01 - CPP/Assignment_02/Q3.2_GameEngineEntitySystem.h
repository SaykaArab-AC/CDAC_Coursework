/*
 * A2Q3_GameEngineEntitySystem.h
 *
 *  Created on: 30-Aug-2026
 *      Author: sayka
 */

#ifndef Q3_2_GAMEENGINEENTITYSYSTEM_H_
#define Q3_2_GAMEENGINEENTITYSYSTEM_H_


namespace Physics{
	double clamp(double val, double min, double max);

	double lerp(double a, double b, double t);

}

namespace GameMath{
	int clamp(int val, int min, int max);

	double lerp(double a, double b, double t);

}




#endif /* Q3_2_GAMEENGINEENTITYSYSTEM_H_ */
