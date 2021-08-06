# multithreading-in-java-nadideyucel
multithreading-in-java-nadideyucel created by GitHub Classroom

Spring Boot ile Multithreading

Çoklu iş parçacığı, çoklu göreve benzer, ancak birden çok işlem yerine birden çok iş parçacığının aynı anda yürütülmesinin işlenmesini sağlar. Java 8'de tanıtılan CompletableFuture, eşzamansız, engellemesiz ve çok iş parçacıklı kod yazmak için kolay bir yol sağlar. Asenkron hesaplamaları işlemek için Java 5'te tanıtılan Future arabirimi. Ancak, bu arabirimin birden çok eşzamansız hesaplamayı birleştirmek ve olası tüm hataları işlemek için herhangi bir yöntemi yoktu. CompletableFuture, Future arayüzünü uygular, birden fazla asenkron hesaplamayı birleştirebilir, olası hataları işleyebilir ve çok daha fazla yetenek sunar.
Java'nın ilk günlerinden beri, çoklu kullanım dilin önemli bir yönü olmuştur. Runnable, çok iş parçacıklı görevleri temsil etmek için sağlanan çekirdek arabirimdir ve Callable, Runnable'ın Java 1.5'te eklenen geliştirilmiş bir sürümüdür.
Her iki arabirim de birden çok iş parçacığı tarafından yürütülebilecek bir görevi temsil edecek şekilde tasarlanmıştır. Çalıştırılabilir görevler Thread sınıfı veya ExecutorService kullanılarak çalıştırılabilirken, Callables yalnızca ikincisi kullanılarak çalıştırılabilir.
Runnable interface'i, işlevsel bir arabirimdir ve herhangi bir parametre kabul etmeyen ve herhangi bir değer döndürmeyen tek bir run() yöntemine sahiptir.

Callable interface'i, genel bir V değeri döndüren tek bir call() yöntemini içeren genel bir arabirimdir.
Callable'ın call() yöntemi, kontrol edilen istisnaları daha fazla kolayca kontrol edebilmemiz için "throws Exception" yan tümcesini içerir:

https://www.baeldung.com/java-runnable-callable
