window.onload = basic

function basic()
{
    var options = {
        series: [14, 23, 21, 17, 15, 10, 12, 17, 21],
        chart: {
          type: 'polarArea',
          events: {
            dataPointSelection: function(event, chartContext, config) {
              var selectedIndex = config.dataPointIndex;
              var selectedValue = options.series[selectedIndex];
              console.log('Selected index: ' + selectedIndex);
              console.log('Selected value: ' + selectedValue);
              
              // Perform your operation here
              alert('You clicked on area with value: ' + selectedValue);
            }
          }
        },
        stroke: {
          colors: ['#fff']
        },
        fill: {
          opacity: 0.8
        },
        responsive: [{
          breakpoint: 480,
          options: {
            chart: {
              width: 200
            },
            legend: {
              position: 'bottom'
            }
          }
        }]
      };
      
      var chart = new ApexCharts(document.querySelector("#chart"), options);
      chart.render();
      
    
}
