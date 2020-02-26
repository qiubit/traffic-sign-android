This writeup just contains a fragment of Jupyter notebook, in which I explain
reasoning between chosen architecture. Additional bullet points describe additional
things worth noting.

## Architecture

We tested two models.

First model had an architecture inspired by ResNet family of networks. The architecture consisted of 5 blocks, each containing a residual convolutional sub-block and a downsampling convolutional layer. Every downsampling convolutional layer decreased image dimensions by 2, so since input image have dimension 32x32, and 2^5=32, then spatial dimensions after fifth block were 1x1. To avoid information loss, we increased number of channels by a factor of 2 with each downsampling layer. Final layer was a dense layer implemented with 1x1 convolution, which outputed class logits.

We noticed this architecture caused validation loss to randomly peak at large values during training - a sign of overfitting. Sub-par performance led to development of the second model.

Following [Traffic Sign Recognition with Multi-Scale Convolutional Networks](http://yann.lecun.com/exdb/publis/pdf/sermanet-ijcnn-11.pdf) we used architecure, in which convolutional layer serve as multi-stage feature extractors. Extracted feature maps are flattened and fed into fully connected classifier layer. We use dropout before that layer to avoid overfitting, which leads to validation loss closely following training loss.

## Additional remarks

- 1cycle policy is used for training. Learning rate is found using fastai learning rate finder. For full explanation, chech [this blogpost](https://sgugger.github.io/the-1cycle-policy.html).
- The network reaches 98% accuracy on validation the dataset and 97.26% accuracy on test dataset.
- Used architecture is mobile-compatible, as demonstrated by mobile app shipped with the repo. The app was tested on Pixel 3a.

