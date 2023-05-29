package innerclasses.local;

public class LocalClassUploader {
    public static void uploadFileToGoogleDrive() {

        class UploadGoogleDrive extends HandlerUploadFile {

            @Override
            public void upload(String url) {
                // upload a file to GoogleDrive
            }
        }
        UploadGoogleDrive uploadGoogleDrive = new UploadGoogleDrive();
        uploadGoogleDrive.upload("https://www.google.com/drive/");
    }


    public static void uploadFileToS3() {
        class UploadS3 extends HandlerUploadFile {

            @Override
            public void upload(String url) {
                // upload a file to S3
            }
        }
        UploadS3 uploadS3 = new UploadS3();
        uploadS3.upload("https://aws.amazon.com/s3/");
    }


    public static void uploadFileToDropbox() {
        class UploadDropBox extends HandlerUploadFile {

            @Override
            public void upload(String url) {
                // upload a file to Dropbox
            }
        }
        UploadDropBox uploadDropBox = new UploadDropBox();
        uploadDropBox.upload("https://aws.dropbox.com/");
    }
}
