package iuh.olpiuh.services;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;


public class FileServices {


    public BufferedImage readFile(String fileLocation) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(fileLocation));
        } catch (IOException e) {
        }

        return img;
    }

    public BufferedImage rotateImage (BufferedImage imag, int n) { //n rotation in gradians

        double rotationRequired = Math.toRadians (n);
        double locationX = imag.getWidth() / 2;
        double locationY = imag.getHeight() / 2;
        AffineTransform tx = AffineTransform.getRotateInstance(rotationRequired, locationX, locationY);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
        BufferedImage newImage =new BufferedImage(imag.getWidth(), imag.getHeight(), imag.getType()); //20, 20 is a height and width of imag ofc
        op.filter(imag, newImage);

        return(newImage);
    }

    public boolean writeFile(BufferedImage  img) {
        try {
            // retrieve image

            File outputfile = new File("D:\\IuhCoder\\backend\\images\\newImage.jpg");
            ImageIO.write(img, "jpg", outputfile);
        } catch (IOException e) {

        }
        return true;
    }

}