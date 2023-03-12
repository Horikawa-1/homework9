# 第9回の課題（MyBatisでCRUD処理のReadの実装）
---
使うデータベースはname_managementコンテナのname_databaseデータベース内のnamesテーブルで、以下がテーブルの詳細で、ID1~ID5までのレコードがあります。

![image](https://user-images.githubusercontent.com/111167638/224326770-2f30b21f-3b38-4e7b-8f82-d55173e92593.png)

* localhost:8080/namesでNameControllerクラスのgetNamesメソッドより、データベースの全nameレコードがJSON形式で返されます。

![スクリーンショット (213)](https://user-images.githubusercontent.com/111167638/224325106-2db72af1-7d64-49a5-a861-a1d964dac88b.png)

* localhost:8080/names/{id}でNameControllerクラスのgetNameByIdメソッドより、指定したIDのnameレコードがJSON形式で返されます。以下ID2、ID5の例です。

![スクリーンショット (214)](https://user-images.githubusercontent.com/111167638/224325400-eaef0fe8-142f-47c4-a4c0-53a32de1b78d.png)

![image](https://user-images.githubusercontent.com/111167638/224325592-961ffb8c-753e-478c-8f90-6b963ec09355.png)

*getNameByIdメソッドで指定されたIDがテーブルになかった場合、例外処理で 「"message": "ID:{指定されたID} Not Found"」、ステータスコード404が返されます（通常は500が返されます）。以下、ID0とID6の例です。

![image](https://user-images.githubusercontent.com/111167638/224542389-3655af12-b8c1-4282-8457-774d24b27a78.png)
![スクリーンショット (221)](https://user-images.githubusercontent.com/111167638/224542421-1b0b268d-48af-4a27-8abf-a8a8f96b7fe8.png)



【環境】


・IntelliJ IDEA Community Edition 2022.1.2

・SDK:Amazon Corretto 17

・Springのバージョン等は↓の通りです![スクリーンショット (165)](https://user-images.githubusercontent.com/111167638/224520259-06ab7c79-eef2-411a-803c-7d17acf0d1cd.png)
