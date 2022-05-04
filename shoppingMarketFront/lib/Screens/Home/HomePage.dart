import 'package:flutter/material.dart';

class HomePage extends StatelessWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("سوپر مارکت انلاین",style: TextStyle(
          color: Colors.white
        )),
        backgroundColor: Color(0xcc379c4d),
        centerTitle: true,
        actions: [
          IconButton(onPressed: (){},
              icon: Icon(Icons.shopping_basket),

          )
        ],
      ),
      body: Container(
        color: Colors.white,
        child: ListView(
          children: [
            Container(
              width: MediaQuery.of(context).size.width,
              height: MediaQuery.of(context).size.height-56,
              decoration: const BoxDecoration(
                image: DecorationImage(
                    image: AssetImage('assets/images/Vegetables.png'),
                    fit: BoxFit.cover),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
