# CustomCamera

Calling camera activity Functionlity.

```
         /*
         * Camera Activity Call
         */
        Intent intent = new Intent(Photograph.this, SubCameraActivity.class);
        intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);

        File mediaFile = new File(filename + ".jpg");
        Uri fileUri = Uri.fromFile(mediaFile);

        /*
         * Camera Activity Call
         */
        intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri); // set the image file name
        
        intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
        startActivityForResult(intent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE1);
```
