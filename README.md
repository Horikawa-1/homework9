# 第9回の課題（MyBatisでCRUD処理のReadの実装）
---
使うデータベースはname_managementコンテナのname_databaseデータベース内のnamesテーブルで、以下がテーブルの詳細です。

![image](https://user-images.githubusercontent.com/111167638/224326770-2f30b21f-3b38-4e7b-8f82-d55173e92593.png)

* localhost:8080/namesでNameControllerクラスのgetNamesメソッドより、データベースの全nameレコードがJSON形式で返されます。

![スクリーンショット (213)](https://user-images.githubusercontent.com/111167638/224325106-2db72af1-7d64-49a5-a861-a1d964dac88b.png)

* localhost:8080/names/{id}でNameControllerクラスのgetNameByIdメソッドより、指定したidのnameレコードがJSON形式で返されます。以下id2、id5の例です。

![スクリーンショット (214)](https://user-images.githubusercontent.com/111167638/224325400-eaef0fe8-142f-47c4-a4c0-53a32de1b78d.png)

![image](https://user-images.githubusercontent.com/111167638/224325592-961ffb8c-753e-478c-8f90-6b963ec09355.png)
