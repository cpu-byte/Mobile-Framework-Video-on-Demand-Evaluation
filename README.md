# Mobile Framework Video-on-Demand Evaluation

This repository accompanies the research that evaluates native and popular cross-platform development frameworks for cloud-enabled video streaming. It contains the source code for all the artefacts discussed in the study.

## Video-on-Demand Resource

The video players within the applications require a link to a resource, the placement of which depends on the artefact. The resource that was used is no longer available as the AWS configuration used within the study is not a free service. You are able to replicate the architecture by using a [AWS CloudFormation template](https://aws.amazon.com/solutions/implementations/video-on-demand-on-aws/) and [downloading the royalty free video](https://mega.nz/folder/z350AaLQ#Bjb8oiu-qHYkSqh3H9cSSg) that was used in the research.

## Android Device Resource Recording

The `script.sh` is required for CPU and RAM resource recording for the Android artefacts. At least, it requires a shell environment, [Android Debug Bridge (ADB)](https://developer.android.com/studio/command-line/adb) installed, and one parameter supplied, which is the application package name which can be addressed through the shorthand identifiers. 

Shorthand package identifiers:
- Kotlin and Flutter: `com.kuberio.vid`
- React Native: `com.videoplayer`

Longhand package identifiers: 
- Kotlin: `com.kuberio.videoplayerkotlin`
- Flutter: `com.kuberio.video_player_flutter`
- React Native: `com.videoplayerreactnative`

The application package identifier will fetch the process identifier, which is tied to the package identifer and can be used to track the application resource utilisation on the device.

## Contact

For any questions or help setting up the resource, get in touch with me by using the contact information on [my GitHub profile](https://github.com/dropcmd).
