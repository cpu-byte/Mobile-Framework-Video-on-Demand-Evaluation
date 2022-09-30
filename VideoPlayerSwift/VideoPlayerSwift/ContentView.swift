//
//  ContentView.swift
//  VideoPlayerSwift
//
//  Created by Borys Kubisty on 10/07/2022.
//

import SwiftUI
import AVKit

struct ContentView: View {
   private let player = AVPlayer(url: URL(string: "https://dj0y8ictbokkx.cloudfront.net/94436a14-9fa4-496f-8d8c-78e84e61ef28/AppleHLS1/forest.m3u8")!)
   
   var body: some View {
     VideoPlayer(player: player)
   }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
