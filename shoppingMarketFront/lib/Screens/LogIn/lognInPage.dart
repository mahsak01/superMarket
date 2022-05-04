import 'package:flutter/material.dart';

class LogInPage extends StatelessWidget {
  const LogInPage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Stack(
        alignment: Alignment.center,
        children: [
          Container(
            width: MediaQuery.of(context).size.width,
            height: MediaQuery.of(context).size.height,
            decoration: const BoxDecoration(
              image: DecorationImage(
                  image: AssetImage('assets/images/LogIn.png'),
                  fit: BoxFit.cover),
            ),
          ),
          SizedBox(
            width: MediaQuery.of(context).size.width / 3,
            height: MediaQuery.of(context).size.height / 1.5,
            child: Container(
              decoration: const BoxDecoration(color: Colors.white),
              child: Padding(
                padding: const EdgeInsets.all(40),
                child: Directionality(
                  textDirection: TextDirection.rtl,
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.center,
                    children: [
                      Text(
                        "ورود",
                        style: TextStyle(fontSize: 40),
                      ),
                      SizedBox(
                        height: 40,
                      ),
                      TextField(
                        decoration: InputDecoration(
                          fillColor: Colors.white,
                          filled: true,
                          labelText: "نام کاربری",
                          labelStyle:
                              TextStyle(fontSize: 15, color: Colors.blue),
                          prefixIcon: Icon(
                            Icons.person,
                            color: Colors.blue,
                          ),
                        ),
                        textDirection: TextDirection.rtl,
                      ),
                      SizedBox(
                        height: 30,
                      ),
                      TextField(
                        decoration: InputDecoration(
                          fillColor: Colors.white,
                          filled: true,
                          labelText: "رمز عبور",
                          labelStyle:
                              TextStyle(fontSize: 15, color: Colors.blue),
                          prefixIcon: Icon(
                            Icons.key,
                            color: Colors.blue,
                          ),
                        ),
                        textDirection: TextDirection.rtl,
                      ),
                      SizedBox(
                        height: 70,
                      ),
                      TextButton(
                          onPressed: () {},
                          style: TextButton.styleFrom(
                            backgroundColor: Colors.blue,
                            minimumSize: Size(500, 60),
                          ),
                          child: Text(
                            "وارد شوید",
                            style: TextStyle(fontSize: 30, color: Colors.white),
                          ))
                    ],
                  ),
                ),
              ),
            ),
          ),
        ],
      ),
    );
  }
}
