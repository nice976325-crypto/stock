<template>
<div class="content" :style='{"minHeight":"100vh","padding":"20px 30px 20px","alignItems":"flex-start","flexWrap":"wrap","background":"url() no-repeat center top / cover","display":"block","fontSize":"14px","height":"auto"}'>
	<!-- notice -->
	<!-- title -->
	<div class="text" :style='{"width":"100%","margin":"10px auto 30px","fontSize":"30px","color":"rgb(51, 51, 51)","textAlign":"center","fontWeight":"600"}'>欢迎使用 {{this.$project.projectName}}</div>
	<!-- statis -->
	<div :style='{"border":"0px solid #bababa","padding":"0","margin":"10px 0 20px","alignItems":"flex-start","color":"#333","display":"block","justifyContent":"center","overflow":"hidden","borderRadius":"0px","flexWrap":"wrap","background":"none","width":"100%","fontSize":"14px","order":"0"}'>
		<div :style='{"padding":"20px 40px 20px 0","margin":"0 1% 12px 0","borderColor":"#e7e8f8","alignItems":"center","textAlign":"center","display":"flex","float":"left","justifyContent":"space-between","borderRadius":"4px","background":"#fff","borderWidth":"0px","width":"19%","position":"relative","borderStyle":"solid"}' v-if="isAuth('topten','首页总数')">
			<div :style='{"alignItems":"center","borderRadius":"0","background":"none","display":"flex","width":"auto","justifyContent":"center","height":"auto","order":"2"}'>
				<span class="icon iconfont " :style='{"width":"54px","fontSize":"50px","color":"#5ab6df","background":"url(http://codegen.caihongy.cn/20231106/10193e908c174cbfa5359c04fe26416e.png) no-repeat center center","height":"43px"}'></span>
			</div>
			<div :style='{"margin":"0","alignItems":"center","textAlign":"left","flexWrap":"wrap","background":"none","display":"flex","width":"auto"}'>
				<div :style='{"padding":"0 10px","margin":"0 auto","color":"#c6cad6","borderRadius":"30px","textAlign":"center","background":"none","width":"auto","lineHeight":"1","fontSize":"36px","minWidth":"80px","fontWeight":"600","height":"auto"}'>{{toptenCount}}</div>
				<div :style='{"margin":"0","color":"#c6cad6","textAlign":"center","width":"100%","lineHeight":"24px","fontSize":"13px","height":"24px"}'>十大成交股总数</div>
			</div>
		</div>
	</div>
	<!-- statis -->
	

	
	<!-- echarts -->
</div>
</template>
<script>
//0
import router from '@/router/router-static'
import * as echarts from 'echarts'
export default {
	data() {
		return {
            toptenCount: 0,
		};
	},
	mounted(){
		this.init();
		this.gettoptenCount();
	},
	methods:{
		init(){
			if(this.$storage.get('Token')){
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code != 0) {
				router.push({ name: 'login' })
				}
			});
			}else{
				router.push({ name: 'login' })
			}
		},
		gettoptenCount() {
			this.$http({
				url: `topten/count`,
				method: "get"
			}).then(({
				data
			}) => {
				if (data && data.code == 0) {
					this.toptenCount = data.data
				}
			})
		},
  }
};
</script>
<style lang="scss" scoped>
    .cardView {
        display: flex;
        flex-wrap: wrap;
        width: 100%;

        .cards {
            display: flex;
            align-items: center;
            width: 100%;
            margin-bottom: 10px;
            justify-content: center;
            .card {
                width: calc(25% - 20px);
                margin: 0 10px;
                /deep/.el-card__body{
                    padding: 0;
                }
            }
        }
    }
	
	// 日历
	.calendar td .text {
				border: 1px solid #f6f6f6;
				border-radius: 0px;
				flex-direction: column;
				color: #888;
				background: none;
				display: flex;
				width: 100%;
				justify-content: center;
				align-items: center;
				height: 100%;
			}
	.calendar td .text:hover {
			}
	.calendar td .text .new {
				color: inherit;
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td .text .old {
				color: inherit;
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td.festival .text {
				border: 0px solid rgba(93, 213, 200, .1);
				border-radius: 0px;
				flex-direction: column;
				color: #666;
				background: #78CD5110;
				display: flex;
				width: 100%;
				justify-content: center;
				align-items: center;
				height: 100%;
			}
	.calendar td.festival .text:hover {
			}
	.calendar td.festival .text .new {
				color: inherit;
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td.festival .text .old {
				color: inherit;
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td.other .text {
				border-radius: 20px;
				flex-direction: column;
				background: none;
				display: flex;
				width: 100%;
				font-size: inherit;
				justify-content: center;
				align-items: center;
				opacity: 0.6;
				height: 100%;
			}
	.calendar td.other .text:hover {
				background: none;
			}
	.calendar td.other .text .new {
				color: #000;
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td.other .text .old {
				color: #666;
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td.today .text {
				border-radius: 2px;
				flex-direction: column;
				color: #000;
				background: #78CD5180;
				display: flex;
				width: 100%;
				justify-content: center;
				align-items: center;
				height: 100%;
			}
	.calendar td.today .text:hover {
			}
	.calendar td.today .text .new {
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td.today .text .old {
				font-size: inherit;
				line-height: 1.4;
			}
	
	// echarts1
	.type1 .echarts1 {
				border: 0px solid #355749;
				border-radius: 4px;
				padding: 10px;
				margin: 0 0 30px;
				background: rgba(255,255,255,1);
				width: 100%;
				border-width: 2px 0 0;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type1 .echarts1:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	// echarts2
	.type2 .echarts1 {
				border: 0px solid #355749;
				border-radius: 4px;
				padding: 10px;
				margin: 0 0 30px;
				background: rgba(255,255,255,1);
				width: 49%;
				border-width: 2px 0 0;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type2 .echarts1:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type2 .echarts2 {
				border: 0px solid #355749;
				border-radius: 4px;
				padding: 10px;
				margin: 0 0 30px;
				background: rgba(255,255,255,1);
				width: 49%;
				border-width: 2px 0 0;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type2 .echarts2:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	// echarts3
	.type3 .echarts1 {
				border: 0px solid #355749;
				border-radius: 4px;
				padding: 10px;
				margin: 0 0 30px;
				color: #333;
				background: rgba(255,255,255,.96);
				width: 49%;
				border-width: 2px 0 0;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type3 .echarts1:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type3 .echarts2 {
				border: 0px solid #355749;
				border-radius: 4px;
				padding: 10px;
				margin: 0 0 30px;
				background: rgba(255,255,255,1);
				width: 49%;
				border-width: 2px 0 0;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type3 .echarts2:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type3 .echarts3 {
				border: 0px solid #355749;
				border-radius: 4px;
				padding: 10px;
				margin: 0 0 30px;
				background: rgba(255,255,255,1);
				width: 100%;
				border-width: 2px 0 0;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type3 .echarts3:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	// echarts4
	.type4 .echarts1 {
				border: 0px solid #355749;
				border-radius: 4px;
				padding: 10px;
				margin: 0px 0 30px;
				background: rgba(255,255,255,1);
				width: 49%;
				border-width: 2px 0 0;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type4 .echarts1:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type4 .echarts2 {
				border: 0px solid #355749;
				border-radius: 4px;
				padding: 10px;
				margin: 0px 0 30px;
				background: rgba(255,255,255,1);
				width: 49%;
				border-width: 2px 0 0;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type4 .echarts2:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type4 .echarts3 {
				border: 0px solid #355749;
				border-radius: 4px;
				padding: 10px;
				margin: 0px 0 30px;
				background: rgba(255,255,255,1);
				width: 49%;
				border-width: 2px 0 0;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type4 .echarts3:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type4 .echarts4 {
				border: 0px solid #355749;
				border-radius: 4px;
				padding: 10px;
				margin: 0px 0 30px;
				background: rgba(255,255,255,1);
				width: 49%;
				border-width: 2px 0 0;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type4 .echarts4:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	// echarts5
	.type5 .echarts1 {
				border: 0px solid #355749;
				border-radius: 4px;
				padding: 10px;
				margin: 0px 0 30px;
				background: rgba(255,255,255,.96);
				width: 49%;
				border-width: 2px 0 0;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type5 .echarts1:hover {
				box-shadow: 0 1px 10px 1px rgba(115,108,203,.1);
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type5 .echarts2 {
				border: 0px solid #355749;
				border-radius: 4px;
				padding: 10px;
				margin: 0px 0 30px;
				background: rgba(255,255,255,1);
				width: 49%;
				border-width: 2px 0 0;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type5 .echarts2:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type5 .echarts3 {
				border: 0px solid #355749;
				border-radius: 4px;
				padding: 10px;
				margin: 0px 0 30px;
				background: rgba(255,255,255,1);
				width: 100%;
				border-width: 2px 0 0;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type5 .echarts3:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type5 .echarts4 {
				border: 0px solid #355749;
				border-radius: 4px;
				padding: 10px;
				margin: 0px 0 30px;
				background: rgba(255,255,255,1);
				width: 49%;
				border-width: 2px 0 0;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type5 .echarts4:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type5 .echarts5 {
				border: 0px solid #355749;
				border-radius: 4px;
				padding: 10px;
				margin: 0px 0 30px;
				background: rgba(255,255,255,1);
				width: 49%;
				border-width: 2px 0 0;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type5 .echarts5:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	
	.echarts-flag-2 {
	  display: flex;
	  flex-wrap: wrap;
	  justify-content: space-between;
	  padding: 10px 20px;
	  background: rebeccapurple;
	
	  &>div {
	    width: 32%;
	    height: 300px;
	    margin: 10px 0;
	    background: rgba(255,255,255,.1);
	    border-radius: 8px;
	    padding: 10px 20px;
	  }
	}
</style>
