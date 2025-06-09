def call(){
  timeout(time: 50, unit: "MINUTES"){
      waitForQualityGate abortPipeline: false
  }
}
