node('dev') {
  def wsDirPath = this.env.getProperty('WORKSPACE')
  try {
    println wsDirPath
    
  } catch(Exception e) {
    
  } finally {
    
  }
  
}
