//  Created by react-native-create-bridge

import { NativeModules } from 'react-native'

const { PolarSDK } = NativeModules

export default {
  scanDevices () {
    return PolarSDK.scanDevices()
  }
}
