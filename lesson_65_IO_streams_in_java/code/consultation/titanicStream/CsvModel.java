package consultation.titanicStream;

import java.util.Objects;

public class CsvModel {

    double fare;
    int pClass;
    boolean isSurvived;
    boolean isFemale;
    double age;

    public CsvModel(double fare, int pClass, boolean isSurvived, boolean isFemale, double age) {
        this.fare = fare;
        this.pClass = pClass;
        this.isSurvived = isSurvived;
        this.isFemale = isFemale;
        this.age = age;
    }

    public double getFare() {
        return fare;
    }

    public int getpClass() {
        return pClass;
    }

    public boolean isSurvived() {
        return isSurvived;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public double getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "CsvModel{" +
                "fare=" + fare +
                ", pClass=" + pClass +
                ", isSurvived=" + isSurvived +
                ", isFemale=" + isFemale +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CsvModel csvModel = (CsvModel) o;
        return Double.compare(fare, csvModel.fare) == 0 && pClass == csvModel.pClass && isSurvived == csvModel.isSurvived && isFemale == csvModel.isFemale && age == csvModel.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fare, pClass, isSurvived, isFemale, age);
    }
}
