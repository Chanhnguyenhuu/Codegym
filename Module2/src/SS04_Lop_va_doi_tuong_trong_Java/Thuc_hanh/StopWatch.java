package SS04_Lop_va_doi_tuong_trong_Java.Thuc_hanh;

public class StopWatch {

    long startTime;
    long stopTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

//    public StopWatch(long startTime, long stopTime) {
//        this.startTime = startTime;
//        this.stopTime = stopTime;
//    }

    public long start() {
        return this.startTime;
    }

    public long stop() {
        return this.stopTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return stop() - start();
    }

    public String display() {
        return "Thời gian chạy là: " + getElapsedTime() + " mili giây";
    }
}
