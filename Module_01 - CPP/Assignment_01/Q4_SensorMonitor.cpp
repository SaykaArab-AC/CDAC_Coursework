#include <iostream>
#include <cstdlib>
using namespace std;

int main(int argc, char *argv[])
{
	if (argc < 3)
	{
		cout << "sage   : ./Q4_Sensormonitor <warn_threshold> <critical_threshold> <num_readings>\nError   : Missing arguments." << endl;
		return 1;
	}
	int warn = stoi(argv[0]);
	int critical = stoi(argv[1]);
	int num_readings = stoi(argv[2]);

	if (warn < critical && num_readings >= 1 && num_readings <= 500)
		cout << "Config : Warn = " << warn << "℃   Critical = " << critical << "℃   Reading = " << num_readings << endl;
	else
	{
		cout << "Error" << endl;
		return 1;
	}
	int normal = 0;
	int warning = 0;
	int criticall = 0;
	int shutdown = 0;
	int temperature = rand() % 70;
	if (temperature >= 0 && temperature < 30)
	{
		normal++;
	}
	else if (temperature >= 30 && temperature < 45)
	{
		warning++;
	}
	else if (temperature >= 45 && temperature < 60)
	{
		criticall++;
	}
	else
	{
		shutdown++;
	}

	cout << "Results : Normal : " << normal << "  Warning : " << warning << "   Critical : " << criticall << "   Shutdown : " << shutdown << endl;
	return 0;
}
