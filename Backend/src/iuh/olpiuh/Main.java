package iuh.olpiuh;

import iuh.olpiuh.services.FileServices;

import javax.imageio.ImageIO;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;


public class Main {

    public static void main(String[] args) {
        String fileLocation = "D:\\IuhCoder\\backend\\images\\stab1.png";
        FileServices fileServices = new FileServices();
        BufferedImage image = fileServices.readFile(fileLocation);
        System.out.println(image);
        BufferedImage newImg = fileServices.rotateImage(image, 180);
        fileServices.writeFile(newImg);
        System.out.println("Ghi file thanh cong");
    }


}
