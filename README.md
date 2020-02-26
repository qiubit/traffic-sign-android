# traffic-sign-android

[![Udacity - Self-Driving Car NanoDegree](https://s3.amazonaws.com/udacity-sdc/github/shield-carnd.svg)](http://www.udacity.com/drive)

Traffic sign classifier trained using fastai and deployed to run in real time (60-70 FPS) on Android using PyTorch Mobile.

The Android app is based on [pytorch/android-demo-app](https://github.com/pytorch/android-demo-app), an official demo app for PyTorch Mobile project.

![Android app screenshots](https://i.imgur.com/xxYWbWh.jpg)

## Training the model

To train the model, launch `Traffic_Sign_Classifier.ipynb` notebook using [Google Colab](https://colab.research.google.com/),
preferably using GPU runtime.

This repo can be directly imported using Google Colab GitHub import feature.

## Building and launching the app

To build and launch the Android app, open `Android/build.gradle` in `Android Studio`.
