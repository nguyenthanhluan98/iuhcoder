package iuh.olpiuh.model;

import java.util.Objects;

public class File {

    private String extention;
    private double fileSize;
    private String fileName;
    private String localtion;

    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getLocaltion() {
        return localtion;
    }

    public void setLocaltion(String localtion) {
        this.localtion = localtion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return Double.compare(file.fileSize, fileSize) == 0 &&
                Objects.equals(extention, file.extention) &&
                Objects.equals(fileName, file.fileName) &&
                Objects.equals(localtion, file.localtion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extention, fileSize, fileName, localtion);
    }
}
