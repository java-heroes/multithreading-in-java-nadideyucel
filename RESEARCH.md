[![Work in MakeCode](https://classroom.github.com/assets/work-in-make-code-c53f0c86300af1a64cdd5dc830e2509efd17c8cb483a722cacaee84d10eb8ec9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=5376531&assignment_repo_type=AssignmentRepo)
Thread Safe, anlam olarak iş parçacığı güvenliği şeklinde Türkçe ifade edebileceğimiz bir kavramdır. Thread Safe; birden çok thread’in tekbir kaynağı aynı anda kullanabilmesi/erişebilmesi durumlarında ortaya çıkabilecek tutarsızlıklar neticesinde üretilecek olası hatalara karşı o anki thread’in kaynağını güvenceye alan ve bunu o kaynağı kullanan tüm threadler için sağlayan bir konsepttir.

Elimizdeki bir kaynağı aynı zamanda bir thread okurken bir başka thread kaynaktaki veriler üzerinde değişiklik yaparsa (yahut biri yazar bir diğeri silerse vs.) işte bu tarz asenkron durumlarda hatalar söz konusu olacaktır. İşte bu hataları engellemek ve birden fazla threadin kullandığı kaynak üzerinde oluşan değişiklikleri sadece o anda o değişikliği yapan threadin yaptığını düşündürmek için Thread Safe ile gerekli önlemler sağlanmaktadır.

Java'da çoklu iş parçacığı, aynı anda birden çok iş parçacığı yürütme işlemidir.

Bir iş parçacığı, en küçük işleme birimi olan hafif bir alt işlemdir. Çoklu işlem ve çoklu iş parçacığı, her ikisi de çoklu görev elde etmek için kullanılır.

Ancak, iş parçacıkları paylaşılan bir bellek alanı kullandığından, çoklu işleme yerine çoklu iş parçacığı kullanıyoruz. Ayrı bellek alanı ayırmazlar, bu nedenle bellekten tasarruf sağlarlar ve iş parçacıkları arasında bağlam değiştirme, işlemden daha az zaman alır.

Java Multithreading çoğunlukla oyunlarda, animasyonlarda vb. kullanılır.

Java Multithreading'in Avantajları
1) Threadler bağımsız olduğu için kullanıcıyı engellemez ve aynı anda birden fazla işlem gerçekleştirebilirsiniz.

2) Bir çok işlemi bir arada gerçekleştirebilir, zamandan tasarruf sağlar.

3) İş parçacıkları bağımsızdır, bu nedenle tek bir iş parçacığında bir istisna oluşursa diğer iş parçacıklarını etkilemez.
   Java, thread programlamaya ulaşmak için Thread sınıfı sağlar. Thread sınıfı, bir thread üzerinde işlemler oluşturmak ve gerçekleştirmek için yapıcılar ve yöntemler sağlar. Thread sınıfı, Object sınıfını genişletir ve Runnable arabirimini uygular.
   https://www.javatpoint.com/multithreading-in-java#thread

Çoklu iş parçacığı, maksimum CPU kullanımı için bir programın iki veya daha fazla bölümünün aynı anda yürütülmesine izin veren bir Java özelliğidir. Böyle bir programın her bir parçasına iş parçacığı denir. Bu nedenle, iş parçacıkları bir işlem içindeki hafif işlemlerdir.

Threadler iki mekanizma kullanılarak oluşturulabilir:

1.Thread sınıfını extend etmek
2.Runnable interface ini Uygulamak
https://www.geeksforgeeks.org/multithreading-in-java/?ref=lbp

[![Work in MakeCode](https://classroom.github.com/assets/work-in-make-code-c53f0c86300af1a64cdd5dc830e2509efd17c8cb483a722cacaee84d10eb8ec9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=5376531&assignment_repo_type=AssignmentRepo)

Spring Boot ile Multithreading

Çoklu iş parçacığı, çoklu göreve benzer, ancak birden çok işlem yerine birden çok iş parçacığının aynı anda yürütülmesinin işlenmesini sağlar. Java 8'de tanıtılan CompletableFuture, eşzamansız, engellemesiz ve çok iş parçacıklı kod yazmak için kolay bir yol sağlar.
Asenkron hesaplamaları işlemek için Java 5'te tanıtılan Future arabirimi. Ancak, bu arabirimin birden çok eşzamansız hesaplamayı birleştirmek ve olası tüm hataları işlemek için herhangi bir yöntemi yoktu. CompletableFuture, Future arayüzünü uygular, birden fazla asenkron hesaplamayı birleştirebilir, olası hataları işleyebilir ve çok daha fazla yetenek sunar.