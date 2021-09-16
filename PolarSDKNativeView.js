//  Created by react-native-create-bridge

import React, { Component } from 'react'
import { requireNativeComponent } from 'react-native'

const PolarSDK = requireNativeComponent('PolarSDK', PolarSDKView)

export default class PolarSDKView extends Component {
  render () {
    return <PolarSDK {...this.props} />
  }
}

PolarSDKView.propTypes = {
  exampleProp: React.PropTypes.any
}
