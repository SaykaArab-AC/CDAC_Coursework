#include <iostream>
#include <iomanip>
#include <vector>
using namespace std;

using Header     = pair<string, string>;
using HeaderList = vector<Header>;
using Port       = unsigned int;
using IPAddress  = string;

typedef unsigned long long RequestId;

enum class HttpStatus{
	OK			   = 200,
	Created        = 201,
	BadRequest	   = 400,
	Unauthorized   = 401,
	NotFound       = 404,
	ServerError    = 500
};

void handleResponse(HttpStatus status, const string& endpoint);
void printHeaders(const HeaderList& headers);

int main() {
	// PART A ->
	handleResponse(HttpStatus::OK,"[GET /api/users]");
	handleResponse(HttpStatus::Unauthorized,"[POST /api/login]");
	handleResponse(HttpStatus::NotFound,"[GET /api/products/99]");
	handleResponse(HttpStatus::ServerError,"[POST /api/order]");

	// PART B ->
	Port serverPort=8080;
	RequestId reqId=17665532;

	cout<<endl<<endl;
	cout<<"Request ID  : "<<reqId<<endl;
	cout<<"Server Port : "<<serverPort<<endl;

	HeaderList headers = {
	    {"Content-Type", "application/json"},
	    {"Authorization", "Bearer eyJhbGci..."},
	    {"Accept-Language", "en-US"}
	};

	printHeaders(headers);

	return 0;
}

void handleResponse(HttpStatus status, const string& endpoint){
	int ch=static_cast<int>(status);

	switch(ch){
		case 200:
			cout<<left;
			cout<<setw(23)<<endpoint<<" -> "<<ch<<left<<setw(20)<<" OK"<<": Request Successful"<<endl;
			break;
		case 201:
			cout<<left;
			cout<<setw(23)<<endpoint<<" -> "<<ch<<left<<setw(20)<<" Created"<<": Resource successfully created"<<endl;
			break;
		case 400:
			cout<<left;
			cout<<setw(23)<<endpoint<<" -> "<<ch<<left<<setw(20)<<" BadRequest"<<": Invalid Request"<<endl;
			break;
		case 401:
			cout<<left;
			cout<<setw(23)<<endpoint<<" -> "<<ch<<left<<setw(20)<<" Unauthorized"<<":  Authentication required"<<endl;
			break;
		case 404:
			cout<<left;
			cout<<setw(23)<<endpoint<<" -> "<<ch<<left<<setw(20)<<" NotFound"<<": Endpoint does not exist"<<endl;
			break;
		case 500:
			cout<<left;
			cout<<setw(23)<<endpoint<<" -> "<<ch<<left<<setw(20)<<" ServerError"<<": Internal server error — retry later"<<endl;
			break;
	}
}

void printHeaders(const HeaderList& headers){
	cout<<headers[0].first<<" : "<<headers[0].second<<endl;
	cout<<headers[1].first<<" : "<<headers[0].second<<endl;
	cout<<headers[2].first<<" : "<<headers[0].second<<endl;
}



//
//// Vector & Pair
//pair<string,string> h = {"Name","Sayka"};
//cout<<h.first<<endl;
//cout<<h.second<<endl;
