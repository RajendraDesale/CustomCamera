# CustomCamera

1. Import this project as a module in your Project.

2. use below code for calling camera activity.

```
        /*
         Camera Activity Call
        */
        Intent intent = new Intent(Photograph.this, MainActivity.class);
        intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);

        /* 
        File and File Uri used for save the data directly into your created file in local
        */
        File mediaFile = new File(filepath + filename + ".jpg");
        Uri fileUri = Uri.fromFile(mediaFile);

        intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri); // set the image file name
        intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
        startActivityForResult(intent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE1);
```
3. result will get in onActivityResult() method. 
