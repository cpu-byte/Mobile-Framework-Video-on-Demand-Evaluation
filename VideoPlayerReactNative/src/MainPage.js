import React from 'react';
import {SafeAreaView, StyleSheet} from 'react-native';
import Video from 'react-native-video';

const URI =
  'https://dj0y8ictbokkx.cloudfront.net/94436a14-9fa4-496f-8d8c-78e84e61ef28/AppleHLS1/forest.m3u8';

class MainPage extends React.Component {
  videoBuffer = isBuffer => {
    console.log(isBuffer);
  };

  render() {
    return (
      <SafeAreaView>
        <Video
          source={{uri: URI}}
          style={styles.videoPlayer}
          controls={true}
          onBuffer={this.videoBuffer}
          ref={ref => {
            this.player = ref;
          }}
        />
      </SafeAreaView>
    );
  }
}

var styles = StyleSheet.create({
  videoPlayer: {
    width: '100%',
    height: 300,
  },
});

export default MainPage;
