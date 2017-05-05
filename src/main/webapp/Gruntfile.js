module.exports = function(grunt){
    require('load-grunt-tasks')(grunt); //加载所有的任务
    //require('time-grunt')(grunt); 如果要使用 time-grunt 插件

    grunt.initConfig({
        pkg: grunt.file.readJSON('package.json'),

        connect: {
            options: {
                port: 8080,
                hostname: '*', //默认就是这个值，可配置为本机某个 IP，localhost 或域名
                livereload: 35729,  //声明给 watch 监听的端口
                keepalive:true
            },

            server: {
                options: {
                    open: true, //自动打开网页 http://
                    base:
                        '.'  //主目录

                }
            }
        },

        compass: {

             dist: {
              options: {
                sassDir: 'src/scss',
                cssDir: 'dist/css',
                importPath: 'node_modules/bootstrap/scss'
            }
          }
}



    });
    grunt.registerTask('serve', [
        'connect:server'
    ]);
    grunt.registerTask('cp',['compass']);


};
