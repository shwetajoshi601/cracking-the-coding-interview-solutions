# Problem Statement

Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

For example:
```
[
    1 0 0 1
    0 0 0 0
    1 0 0 1
    1 1 1 1
]
```
The rotated image must look as follows:
```
[
    1 1 0 1
    1 0 0 0
    1 0 0 0
    1 1 0 1
]
```

## Points to Remember

1. If you carefully observe the two images, the rotation can be achieved by merely swapping the elements
2. a[i][j] -> swap -> a[n-1-j][n-1-i]